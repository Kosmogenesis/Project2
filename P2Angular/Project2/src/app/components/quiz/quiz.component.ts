import { animate, state, style, transition, trigger } from '@angular/animations';
import { Component, OnInit } from '@angular/core';
import { QuizService } from 'src/app/services/quiz.service';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.scss'],
  animations:[  
    trigger('answer', [
      transition('void => *', [style({ opacity: 0, transform: 'translateY(-3rem)'}), animate(300)])
    ])
  ]
})
export class QuizComponent implements OnInit {
  quizzes = [];

  currentQuiz:number;
  answerSelected = false;
  correctAnswers = 0;
  incorrectAnswers = 0;
  prevAnswered = [];
  
  result = false;
  resultStatus = 'Show Result';
  
  
    constructor(private quizService: QuizService) { }
  
    ngOnInit(): void {
      this.quizzes = this.quizService.getQuizzes();
      this.currentQuiz = this.getRandom();
      
      this.prevAnswered.push(this.currentQuiz);
    }
  
    onAnswer(option: boolean){
      this.answerSelected = true;
      setTimeout(() => {
        let newQuiz = this.getRandom();
         while(this.prevAnswered.includes(newQuiz) && this.prevAnswered.length < 10){
          newQuiz = this.getRandom();
         }
         this.currentQuiz = newQuiz;
          this.prevAnswered.push(this.currentQuiz);
        
          this.answerSelected = false;
      }, 300);
  
      if(option){
        this.correctAnswers++;
      }else{
        this.incorrectAnswers++;
      }
      
    }

    getRandom(){
      return Math.floor(Math.random() * this.quizzes.length);
    }
  
    showResult(){
      this.result = true;
      this.resultStatus = 'Play Again!';    
    }
    playAgain(){
      this.prevAnswered = [];
      this.prevAnswered.push(this.getRandom());
      this.correctAnswers = 0;
      this.incorrectAnswers = 0;
    }
  

}

// import { Component, OnInit } from '@angular/core';
// import { QuizApiService } from 'src/app/services/quiz-api.service';
// @Component({
//   selector: 'app-quiz',
//   templateUrl: './quiz.component.html',
//   styleUrls: ['./quiz.component.css']
// })
// export class QuizComponent implements OnInit {
//   questions = [];
//   answer = false;
//   num = 0;
//   points = 0;
//   constructor(private api: QuizApiService) { }

//   ngOnInit(): void {
//     this.start();
//   }
//   checkAnswer(correct_answer: String, your_answer: String) {
//     this.answer = correct_answer == your_answer ? true : false;
//     this.answer ? this.points += 10 : this.points -= 5;
//     this.num < this.questions.length ? this.num += 1 : null;
//   }
//   start() {
//     this.questions = [];
//     this.api.getQuiz().subscribe(async (res: { [i: string]: any; }) => {
//       let quiz = res['results'];
//       quiz.forEach(element => {
//         element.incorrect_answers.push(element.correct_answer);
//         element.incorrect_answers.sort(() => .5 - Math.random());
//       });
//       this.questions = await quiz;
//       this.num = 0;
//       this.points = 0;
//     });
//   }
// }