window.onload = function() {

    let a = +prompt("Įveskite pirmąją kraštinę");
    let b = +prompt("Įveskite antrąją kraštinę");
    let c = +prompt("Įveskite trečiąja kraštinę");

    arTrikampisStatusisIsvedimas(a, b, c);

}

function arTrikampisStatusis(a, b, c) {

    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
        return true;
    } else {
        return false;
    }
}

function arTrikampisStatusisIsvedimas(a, b, c) {

    if (arTrikampisStatusis(a, b, c) == true) {
        alert("Trikampis su kraštinėmis " + a + ", " + b + " ir " + c + " yra statusis");
    } else {
        alert("Trikampis su kraštinėmis " + a + ", " + b + " ir " + c + " nėra statusis");
    }
}