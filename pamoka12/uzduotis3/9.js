window.onload = function(){

    let x1 = +prompt("Įveskite pirmojo taško x koordinatę");
    let y1 = +prompt("Įveskite pirmojo taško y koordinatę");
    let x2 = +prompt("Įveskite antrojo taško x koordinatę");
    let y2 = +prompt("Įveskite antrojo taško y koordinatę");

    alert(atstumas(x1, y1, x2, y2));
}

function atstumas (x1, y1, x2, y2){
    return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
}
