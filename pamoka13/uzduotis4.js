window.onload = function() {

    let x = +prompt("Įveskite pirmą skaičių");
    let y = +prompt("įveskite antrą skaičių");

    sumaSandaugaPalyginimasIsvedimas(x, y);
}

function sumaSandaugaPalyginimas(x, y) {

    if ((x * y) > (x + y)) {
        return true;
    } else {
        return false;
    }
}

function sumaSandaugaPalyginimasIsvedimas(x, y) {

    if (sumaSandaugaPalyginimas(x, y) == true) {
        alert("Sąndauga yra didesnė nei suma");
    } else {
        alert("Suma yra didesnė nei sąndauga");
    }
}