import { Component } from '@angular/core';
import { Task } from '../../models/task.model';
import { NgClass } from '@angular/common'; // NgForOf retiré car @for est utilisé
import { FormsModule } from '@angular/forms';
import { TaskService } from '../../services/task';

@Component({
  selector: 'app-task-list',
  imports: [NgClass, FormsModule],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css',
})
export class TaskList {
  tasks: Task[]; // Déclaration simple sans initialisation directe ici
  newTaskTitle = '';

  // Injection et initialisation dans le constructeur
  constructor(private taskService: TaskService) {
    this.tasks = this.taskService.getTasks();
  }

  toggleTask(task: Task) {
    task.completed = !task.completed;
  }

  addTask() {
    this.taskService.addTask({
      id: Date.now(),
      title: this.newTaskTitle,
      completed: false
    });
    this.newTaskTitle = '';
  }
}
