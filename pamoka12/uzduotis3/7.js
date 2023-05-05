window.onload = function(){

    let coordA = prompt("Įveskite koordinatę a");
    let coordB = prompt("Įveskite koordinatę b");

    alert("Vektoriaus su koordinatėmis {" + coordA +"; " + coordB + "} ilgis yra " + vectorLength(coordA, coordB));

}

function vectorLength (a, b){
    return Math.sqrt(a * a + b * b);
}