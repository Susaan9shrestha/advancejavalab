document.addEventListener('DOMContentLoaded', function() {
    const links = document.querySelectorAll('.sidebar a');

    links.forEach(link => {
        link.addEventListener('click', function(e) {
            e.preventDefault();
            const page = link.getAttribute('data-page');
            loadPage(page);
        });
    });

    // Load the default page
    loadPage('listUsers.html');
});

function loadPage(page) {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', page, true);
    xhr.onload = function() {
        if (xhr.status === 200) {
            document.getElementById('main-content').innerHTML = xhr.responseText;
        } else {
            document.getElementById('main-content').innerHTML = '<p>Page not found.</p>';
        }
    };
    xhr.send();
}                