export class Cards {

		
    constructor(
         public id: number,
         public name: string,
         public question: string,
         public answer: string,
         public user_id: object
       
    ) {
        this.id = id;
        this.name = name;
        this.question = question;
        this.answer = answer;
        this.user_id = user_id;

    }
}
