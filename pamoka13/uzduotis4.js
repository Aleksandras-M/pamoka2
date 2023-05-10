window.onload = function() {

    let x = +prompt("Įveskite pirmą skaičių");
    let y = +prompt("įveskite antrą skaičių");

    sumaSandaugaPalyginimas(x, y);
}

function sumaSandaugaPalyginimas(x, y) {

    if ((x * y) > (x + y)) {
        alert("Sąndauga yra didesnė nei suma");
    } else {
        alert("Suma yra didesnė nei sąndauga");
    }
}