window.onload = function () {

    let sk1 = +prompt("įveskite 1-ą skaičių");
    let sk2 = +prompt("įveskite 2-ą skaičių");
    let sk3 = +prompt("įveskite 3-ą skaičių");
    alert(naujaZinute(sk1, sk2, sk3));

    atskirimas();

    faktorialas();

    atskirimas();

    let d = 25;
    let e = -30;
    console.log(moduliuSuma(d, e));
    
    atskirimas();

    let f = 1;
    let g = 10;
    console.log(random(f, g));
}

function atskirimas() {
    console.log("--------------");
}

function naujaZinute (a, b, c) {
    return (a + " " + b + " " + c);
}

function faktorialas() {
 console.log(1);
 console.log(2);
 console.log(2 * 3);
 console.log(2 * 3 * 4);
 console.log(2 * 3 * 4 * 5);
}

function moduliuSuma(x, y) {
    return Math.abs(x) + Math.abs(y);
}

function random(x, y) {
    return Math.random() * (y - x) + x;
}
