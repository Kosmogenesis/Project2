import { Injectable } from '@angular/core';


interface Quiz{
  question: string;
  answer: { option: string, correct: boolean }[];
}

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  quizzes: Quiz[] = [
    {
      question: 'What\'s the capital of America?',
      answer: [
        { option: 'Austin', correct: false },
        { option: 'Washington DC', correct: true },
        { option: 'Tampa', correct: false },
        {option: 'Chicago', correct: false}
      ]
    },
      {
      question: 'What is 1 + 1?',
      answer: [
        { option: '3', correct: false },
        { option: '2', correct: true },
        { option: '11', correct: false },
        {option: 'fish', correct: false}
      ]
    },
        {
      question: 'True or False: Strings are Objects in Java',
      answer: [
        { option: 'True', correct: true },
        { option: 'False', correct: false }
      ]
    },
          {
      question: 'True or False: There are 9 primitive data types in Java',
      answer: [
        { option: 'True', correct: false },
        { option: 'False', correct: true } 
      ]
    }
  ]
  constructor() { }

  getQuizzes() {
    return this.quizzes;
  }
}
