/**
 * Created by argshub on 3/20/2017.
 */

function email() {
    this.getDetails = function () {
        return "<input type='email' placeholder='Enter Your EMail'/>";
    }
}

function text() {
    this.getDetails = function () {
        return "<input type='text' placeholder='Enter Your Text'/>";
    }
}

function password() {
    this.getDetails = function () {
        return "<input type='password' placeholder='Enter Your Password'/>";
    }
}

function select() {
    this.getDetails = function () {
        return "<select name='gender'>"
            + "<option value='0'>Male</option> "
            + "<option value='1'>Female</option> "
            + "</select>";
    }
}

function textarea() {
    this.getDetails = function () {
        return "<textarea name='details' rows='5' cols='5'></textarea>"
    }
}

function submit() {
    this.getDetails = function () {
        return "<button type='submit'>Submit</button>"
    }
}


document.getElementById('input_request').onclick = function () {
    let value = document.getElementById('input_fields').value;
    value = value.split(',');
    for(let x of value) {

        switch (x.toLowerCase()) {
            case 'text':

        }
    }
};