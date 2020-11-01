import {
    FormGroup,
    FormControl,
    Validators
} from '@angular/forms';

export class ClientModelForms {


    FormClient(): FormGroup {
        return new FormGroup({
            name: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
            secondName: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
            lastName: new FormControl('', {
                validators: [
                    Validators.required,
                    Validators.nullValidator,
                ]
            }),
            secondLastName: new FormControl('', {
                validators: [Validators.required,
                Validators.nullValidator,
                ]
            }),
            documentType: new FormControl('', {
                validators: [Validators.required, Validators.nullValidator]
            }),
            numberDocument: new FormControl('', {
                validators: [Validators.required, Validators.nullValidator]
            }),
            address: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
            email: new FormControl('', {
                validators: [
                    Validators.required,
                    Validators.nullValidator,
                    Validators.email
                ]
            }),
            cell: new FormControl('', {
                validators: [Validators.required,
                Validators.nullValidator,
                ]
            }),
            phone: new FormControl('', {
                validators: [Validators.required, Validators.nullValidator]
            }),
        });
    }




}