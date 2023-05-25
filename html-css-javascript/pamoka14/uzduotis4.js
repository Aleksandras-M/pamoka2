window.onload = function() {

    let a = +prompt("Įveskite pirmos kraštinės ilgį");
    let b = +prompt("Įveskite antros kraštinės ilgį");
    let c = +prompt("Įveskite trečios kraštinės ilgį");

    alert("Iš kraštinių " + a + ", " + b + " ir " + c + " galima sudaryti trikampį: " + arSusidarysTrikampis(a, b, c));
}

function arSusidarysTrikampis(a, b, c) {
    return (a <  b + c) && (b < a + c) && (c < b + a);
}