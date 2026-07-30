import { Component } from '@angular/core';
import { Header } from './components/header/header';
import { Footer } from './components/footer/footer';
import { Home } from './components/home/home';
import { Course } from './components/course/course';
import { Student } from './components/student/student';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Header, Footer, Home, Course, Student],
  template: `
    <app-header></app-header>

    <app-home></app-home>

    <app-course></app-course>

    <app-student></app-student>

    <app-footer></app-footer>
  `,
  styleUrl: './app.css'
})
export class App {
}