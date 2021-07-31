import { SubjectSubscriber } from "rxjs/internal/Subject";
import { Status } from "./status";
import { Subjects } from "./subject";
import { Users } from "./users";

export class Cards {

		
    constructor(
         public id: number,
         public name: string,
         public question: string,
        public answer: string,
        public status: Status,
         public subject: Subjects,
         public userId: Users
       
    ) {
        this.id = id;
        this.name = name;
        this.question = question;
        this.answer = answer;
        this.status = status;
        this.subject = subject;
        this.userId = userId;

    }
}
