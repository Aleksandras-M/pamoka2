window.onload = function() {

    let ilgis = +prompt("įveskite stačiakampio ilgį:");
    let plotis = +prompt("įveskite stačiakampio plotį");
    alert("Stačiakampio kurio ilgis yra " + ilgis + " o plotis " + plotis + " perimetras yra: " + perimetras(ilgis, plotis));
}

function perimetras (x, y) {
    return 2 * (x * y);
}