export class Book {

    constructor(
    public bookId: number,
    public title:string,
    public author:string,
    public condition:number,
    public available: boolean,
    public returnDate:number
    ){}
}

