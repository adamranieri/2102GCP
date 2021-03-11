import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Book } from 'src/app/models/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-creator',
  templateUrl: './book-creator.component.html',
  styleUrls: ['./book-creator.component.css']
})
export class BookCreatorComponent implements OnInit {

  title:string = ''
  author:string = ''
  condition:number = 0;

  constructor(private bookService:BookService, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
  }

  async createBook(){
    let book:Book =new Book(0,this.title,this.author,this.condition,true,0)
    book = await this.bookService.createBook(book);
    this._snackBar.open("Created a new book","Close",{duration:3000})
  }

}
