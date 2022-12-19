const div = document.createElement('div');
div.style.color = 'purple';
// div.style['color']
// div.style.bcgr-color*(//*invalid)
div.style.cssText = 'color: purple;background:white';
div.setAttribute('style', 'color: purple;background:white');


div.setAttribute('id', 'first');//set id 
div.getAttribute('id') //returns id
div.removeAttribute('id')//remove id


div.classList.add('new')
div.classList.remove('new')
div.classList.toggle('active')


div.textContent = "Hello World"

div.innerHTML = '<b>HELLO</b>'