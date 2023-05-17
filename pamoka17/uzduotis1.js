window.onload = function() {

    const masyvas1 = [3, 5, 6, 8];
    console.log(masyvas1);

    masyvas1.push(3, 5, 6.325);
    console.log(masyvas1);

    masyvas1.unshift(10, 0, 0, 10);
    console.log(masyvas1);

    masyvas1.shift();
    console.log(masyvas1);

    masyvas1.pop();
    masyvas1.pop();
    console.log(masyvas1);

    const masyvas2 = ["vardas", "labas", "namas", "kelias"];
    console.log(masyvas2);
}
