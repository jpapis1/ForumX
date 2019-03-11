import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { CLIENTS } from './mockData/mock-clients';
import { Client } from './models/client';
import { Observable, of} from 'rxjs';
import { MessageService } from './message.service'; 
@Injectable({
  providedIn: 'root'
})
export class ClientService {
  constructor(private messageService: MessageService, private http: HttpClient) { }

  getClients(): Observable<any> {
    this.messageService.add('ClientService: fetched clients')
    return this.http.get<Client>('http://localhost:8080/api/client');
  }
}
