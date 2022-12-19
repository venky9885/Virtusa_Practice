// Selection of Elemnets
const container = document.querySelector('#container');
console.dir(container.firstElementChild);
const controls = document.querySelector('.controls');
console.dir(controls.previousElementSibling);
//Adding elements

// const container = document.querySelector('#container');
const content = document.createElement('div');
content.classList.add('content');
content.textContent = "Newly added Text";
container.appendChild(content);
