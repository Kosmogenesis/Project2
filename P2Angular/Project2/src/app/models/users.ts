export class Users {
     id: number;
     username: string;
     password: string;
     firstName: string;
     lastName: string;
     email: string;
     card: object;
		
    constructor(
          id: number,
          username: string,
          password: string,
          firstName: string,
          lastName: string,
          email: string,
          card: object
       
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.card = card;

    }
}
