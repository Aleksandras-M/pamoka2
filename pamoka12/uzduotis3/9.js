window.onload = function(){

    let x1 = +prompt("Įveskite pirmojo taško x koordinatę");
    let y1 = +prompt("Įveskite pirmojo taško y koordinatę");
    let x2 = +prompt("Įveskite antrojo taško x koordinatę");
    let y2 = +prompt("Įveskite antrojo taško y koordinatę");

    alert("Atstumas tarp pirmojo taško {" + x1 + ", " + y1 + "} ir antrojo taško {" + x2 + ", " + y2 + "} yra " + atstumas(x1, y1, x2, y2));
}

function atstumas (x1, y1, x2, y2){
    let diffx = x2 - x1
    let diffy = y2 - y1
    return Math.sqrt(Math.pow(diffx, 2) + Math.pow(diffy, 2));
}
