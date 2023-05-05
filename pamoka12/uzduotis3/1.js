window.onload = function() {

    let ilgis = prompt("įveskite stačiakampio ilgį:");
    let plotis = prompt("įveskite stačiakampio plotį");
    console.log(perimetras(ilgis, plotis));
}

function perimetras (x, y) {
    return 2 * (x * y);
}