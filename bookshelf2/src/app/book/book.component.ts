import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  constructor() { }
  @Input() title="";
  @Input() author="";
  @Input() language="";
  @Input() cover="";
  ngOnInit(): void {
  }

}
