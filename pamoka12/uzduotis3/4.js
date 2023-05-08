window.onload = function() {

    let krastine1 = prompt("Įveskite pirmą kraštinę");
    let krastine2 = prompt("Įveskite antrą kraštinę");
    alert("Trikampio kurio kraštinių ilgiai yra " + krastine1 + " ir " + krastine2 + " įžambinės ilgis yra " + izambine(krastine1, krastine2));
}

function izambine (x, y) {
    return Math.sqrt((x * x) + (y * y));
}