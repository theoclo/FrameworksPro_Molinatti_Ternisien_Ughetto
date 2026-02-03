import { Component, signal } from '@angular/core';
import { AppHome } from './app-home/app-home';
import { TaskList } from './components/task-list/task-list';
import { TaskService } from './services/task';

@Component({
  selector: 'app-root',
  imports: [AppHome, TaskList],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Test');

  constructor(private taskService: TaskService) {}

  loadTasks() {
    // Déclenche le remplissage des données dans le service
    this.taskService.loadData();
    console.log('Tâches chargées via le service !');
  }
}
