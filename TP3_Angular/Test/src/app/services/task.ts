import { Injectable } from '@angular/core';
import { Task } from '../models/task.model';

@Injectable({ providedIn: 'root' })
export class TaskService {
  private tasks: Task[] = [];

  getTasks(): Task[] {
    return this.tasks;
  }

  // Nouvelle méthode pour charger des données de test
  loadData() {
    // On vide le tableau avant refaire le plein (évite les doublons)
    this.tasks.length = 0;
    this.tasks.push(
      { id: 1, title: 'Apprendre Angular', completed: false },
      { id: 2, title: 'Faire le TP', completed: true }
    );
  }

  addTask(task: Task) {
    this.tasks.push(task);
  }
}
