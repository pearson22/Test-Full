import {
    FormGroup,
    FormControl,
    Validators
} from '@angular/forms';

export class SaleModelForms {


    FormSale(): FormGroup {
        return new FormGroup({
            client: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
            sale: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
        });
    }




}