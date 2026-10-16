document.addEventListener('DOMContentLoaded', function() {
    const closeButtons = document.querySelectorAll('.close-btn');
    
    closeButtons.forEach(button => {
        button.addEventListener('click', function() {
            if (confirm('确定要关闭这个页面吗？')) {
                window.close();
            }
        });
    });

    const forms = document.querySelectorAll('form');
    
    forms.forEach(form => {
        form.addEventListener('submit', function(e) {
            e.preventDefault();
            alert('感谢您的留言！我们会尽快回复您。');
            form.reset();
        });
    });

    const navLinks = document.querySelectorAll('.nav-links a');
    const currentPage = window.location.pathname.split('/').pop();
    
    navLinks.forEach(link => {
        const linkPage = link.getAttribute('href').split('/').pop();
        if (linkPage === currentPage) {
            link.classList.add('active');
        }
    });

    const musicBtn = document.getElementById('musicBtn');
    const bgMusic = document.getElementById('bgMusic');
    
    if (musicBtn && bgMusic) {
        let isPlaying = false;
        
        musicBtn.addEventListener('click', function() {
            if (isPlaying) {
                bgMusic.pause();
                musicBtn.textContent = '🎵 播放音乐';
                musicBtn.classList.remove('playing');
            } else {
                bgMusic.play();
                musicBtn.textContent = '🔊 暂停音乐';
                musicBtn.classList.add('playing');
            }
            isPlaying = !isPlaying;
        });
    }
});

function showAlert(message) {
    alert(message);
}