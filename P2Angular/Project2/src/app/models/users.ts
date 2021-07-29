export class Users {
    // id: number;
    // username: string;
    // password: string;
    // firstName: string;
    // lastName: string;
    // email: string;
    // card_id: object;
		
    constructor(
         public id: number,
         public username: string,
         public password: string,
         public firstName: string,
         public lastName: string,
         public email: string,
         public card_id: object
       
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.card_id = card_id;

    }
}
