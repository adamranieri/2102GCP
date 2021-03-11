import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/models/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.css']
})
export class BookTableComponent implements OnInit {

  books:Book[] =[]

  constructor(private bookService:BookService) { }

  ngOnInit(): void {
    this.refreshBooks()
   
  }

  async refreshBooks(){
    this.books = await this.bookService.getAllBooks()
  }

}
