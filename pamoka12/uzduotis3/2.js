window.onload = function() {

    let ilgis = prompt("įveskite ilgį");
    let plotis = prompt("įveskite plotį");
    let aukstis = prompt("įveskite aukštį");

    console.log(plotas(ilgis, plotis, aukstis));
}

function plotas(a, b,c){
    return (2 * a * b) + (2 * a * c) + (2 * b * c);
}