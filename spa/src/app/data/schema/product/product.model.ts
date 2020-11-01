import {
    FormGroup,
    FormControl,
    Validators
} from '@angular/forms';

export class ProductModelForms {


    FormProduct(): FormGroup {
        return new FormGroup({
            name: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
            value: new FormControl('', {
                validators: [
                    Validators.nullValidator,
                ]
            }),
        });
    }




}