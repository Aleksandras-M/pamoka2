window.onload = function() {

    let x = prompt("Įveskite skaičių kuri norite patikrinti");

    arTrejetoKartotinisIsvedimas(x);
}

function arTrejetoKartotinis(x) {

    if (x % 5 == 0) {
        return true;
    } else {
        return false;
    }
}

function arTrejetoKartotinisIsvedimas(x) {

    if (arTrejetoKartotinis(x) == true) {
        alert("Įvestas skaičius YRA penketo kartotinis");
    } else {
        alert("Įvestas skaičius NĖRA penketo kartotinis");
    }
}