window.onload = function() {

    let krastineA = prompt("Įveskite pirmą kraštinę");
    let krastineB = prompt("Įveskite antrą kraštinę");
    console.log(izambine(krastineA, krastineB));
}

function izambine (x, y) {
    return Math.sqrt((x * x) + (y * y));
}