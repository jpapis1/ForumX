import { Component, OnInit } from '@angular/core';
import { CLIENTS } from '../mockData/mock-clients';
import { Client } from '../models/client';
import { ClientService } from '../client.service';
@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrls: ['./clients.component.less']
})
export class ClientsComponent implements OnInit {
  clients: Array<any>;
 // clients = CLIENTS;
  selectedClient : Client;
  constructor(private clientService: ClientService) { }
  onSelect(client: Client): void {
    this.selectedClient = client;
  }
  getClients(): void {
    this.clientService.getClients().subscribe(clients => this.clients = clients);
  }

  ngOnInit() {
    this.getClients();
  }

}
