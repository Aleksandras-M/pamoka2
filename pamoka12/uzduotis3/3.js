window.onload = function() {

    let r = prompt("Įveskite apskritimo spindulį");
    console.log(plotas(r));

}

function plotas (x) {
    return Math.PI * (x * x);
}
