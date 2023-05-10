window.onload = function() {

    let x = +prompt("Įveskite amžių");
    arTinkamasAmziusIsvedimas(x);

}

function arTinakmasAmzius(x) {
    return x >= 0 && x <= 120;
}

function arTinkamasAmziusIsvedimas(x) {
    if (arTinakmasAmzius(x) == true) {
        alert("Amžius yra tinkamas");
    } else {
        alert("Amžius nėra tinkamas");
    }
}