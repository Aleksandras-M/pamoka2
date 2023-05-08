window.onload = function() {

    let r = prompt("Įveskite apskritimo spindulį");
    alert("Apskritimo su spinduliu " + r + " plotas yra " + plotas(r));

}

function plotas (x) {
    return Math.PI * (x * x);
}
