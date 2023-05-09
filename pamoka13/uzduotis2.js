window.onload = function() {

    let x = prompt("Įveskite skaičių kuri norite patikrinti");

    arPenketoKartotinis(x);
}

function arPenketoKartotinis(x) {

    if (x % 5 == 0) {
        alert("Įvestas skaičius YRA penketo kartotinis");
    } else {
        alert("Įvestas skaičius NĖRA penketo kartotinis");
    }
}