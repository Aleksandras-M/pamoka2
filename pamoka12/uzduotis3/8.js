window.onload = function () {

    let a = +prompt("Įveskite pirmą trikampio kraštinę");
    let b = +prompt("Įveskite antrą trikampio kraštinę");
    let c = +prompt("Įveskite trečią trikampio kraštinę");

    alert("Trikampio kurio kraštinės yra " + a + ", " + b + " ir " + c + " plotas pagal Herono formulę yra " + plotas(a, b, c));
}

function pusperimetris(a, b, c) {
    return (a + b + c)/2;
}

function plotas(a, b, c) {
    return Math.sqrt(pusperimetris(a, b, c) * (pusperimetris(a, b, c) - a) * (pusperimetris(a, b, c) - b) * (pusperimetris(a, b, c) - c));
}