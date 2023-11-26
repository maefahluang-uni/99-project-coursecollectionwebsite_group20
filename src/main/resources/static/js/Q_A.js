const commentContainer = document.getElementById('commentContainer');

function addComment() {
    const commentText = document.getElementById('commentText').value;
    if (commentText.trim() !== '') {
        const comment = createComment('Bell', 'images.jpg', getCurrentTime(), commentText);
        commentContainer.appendChild(comment);
        document.getElementById('commentText').value = '';
    }
}

function createComment(author, profilePic, time, content) {
    const comment = document.createElement('div');
    comment.className = 'comment';

    const header = document.createElement('div');
    header.className = 'comment-header';

    const profilePicElement = document.createElement('img');
    profilePicElement.src = profilePic;
    profilePicElement.alt = 'Profile Picture';
    profilePicElement.className = 'profile-pic';

    const authorElement = document.createElement('div');
    authorElement.className = 'comment-author';
    authorElement.innerText = author;

    const timeElement = document.createElement('div');
    timeElement.className = 'comment-time';
    timeElement.innerText = time;

    header.appendChild(profilePicElement);
    header.appendChild(authorElement);
    header.appendChild(timeElement);

    const contentElement = document.createElement('div');
    contentElement.className = 'comment-content';
    contentElement.innerText = content;

    const actionsElement = document.createElement('div');
    actionsElement.className = 'comment-actions';

    const likeBtn = document.createElement('span');
    likeBtn.className = 'like-btn';
    likeBtn.innerHTML = '&#x1F44D; Like';
    likeBtn.addEventListener('click', () => toggleLike(likeBtn));

    const unlikeBtn = document.createElement('span');
    unlikeBtn.className = 'unlike-btn';
    unlikeBtn.innerHTML = '&#x1F44E; Unlike';
    unlikeBtn.addEventListener('click', () => toggleUnlike(unlikeBtn));

    const replyBtn = document.createElement('span');
    replyBtn.className = 'reply-btn';
    replyBtn.innerHTML = '&#x1F4AC; Reply';
    replyBtn.addEventListener('click', () => toggleReply(replyBtn));

    const replyInput = document.createElement('div');
    replyInput.className = 'reply-input';
    const replyTextarea = document.createElement('textarea');
    replyTextarea.placeholder = 'Reply to this comment';
    const replyPostBtn = document.createElement('button');
    replyPostBtn.innerHTML = 'Post';
    replyPostBtn.addEventListener('click', () => postReply(replyTextarea, replyInput));

    replyInput.appendChild(replyTextarea);
    replyInput.appendChild(replyPostBtn);

    actionsElement.appendChild(likeBtn);
    actionsElement.appendChild(unlikeBtn);
    actionsElement.appendChild(replyBtn);
    actionsElement.appendChild(replyInput);

    comment.appendChild(header);
    comment.appendChild(contentElement);
    comment.appendChild(actionsElement);

    return comment;
}

function toggleLike(likeBtn) {
    likeBtn.classList.toggle('liked');

}

function toggleUnlike(unlikeBtn) {
    unlikeBtn.classList.toggle('unliked');
}

function toggleReply(replyBtn) {
    const replyInput = replyBtn.nextElementSibling;
    replyInput.style.display = (replyInput.style.display === 'none' || replyInput.style.display === '') ? 'block' : 'none';
}

function postReply(replyTextarea, replyInput) {
    const replyText = replyTextarea.value;
    if (replyText.trim() !== '') {
        const reply = document.createElement('div');
        reply.className = 'comment reply';
        const replyAuthor = document.createElement('div');
        replyAuthor.className = 'comment-author';
        replyAuthor.innerText = 'User';
        const replyContent = document.createElement('div');
        replyContent.className = 'comment-content';
        replyContent.innerText = replyText;
        reply.appendChild(replyAuthor);
        reply.appendChild(replyContent);
        commentContainer.appendChild(reply);
        replyTextarea.value = '';
        replyInput.style.display = 'none';
    }
}

function getCurrentTime() {
    const now = new Date();
    const hours = now.getHours().toString().padStart(2, '0');
    const minutes = now.getMinutes().toString().padStart(2, '0');
    return `${hours}:${minutes}`;
}

