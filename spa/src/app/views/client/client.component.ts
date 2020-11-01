import { Component, OnInit } from '@angular/core';
import { ClientService } from 'src/app/data/service/client/client.service';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

  constructor(
    public clientService: ClientService,
  ) { }

  ngOnInit(): void {
  }


  Create() {
    let client = this.clientService.clientForm;
    if(client.valid){
      const CLIENT = {
        id:0,
        personalInformation: { 
          name:client.value.name,
          secondName:client.value.secondName,
          lastName:client.value.lastName,
          secondLastName:client.value.secondLastName,
          documentType:client.value.documentType,
          numberDocument:client.value.numberDocument,
        },
        locationInformation: { 
          address:client.value.address,
          email:client.value.email,
          cell:client.value.cell,
          phone:client.value.phone,
        },
      };
      this.clientService.post('client', CLIENT).subscribe(
        response => {
          client.reset();
        },
        error => {
        }
      );
    }
  }

}
