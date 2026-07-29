import React, { Component } from "react";
import Post from "./Port";

class Posts extends Component {
  constructor() {
    super();

    this.state = {
      posts: []
    };
  }

  loadPosts() {
    const posts = [
      new Post(
        1,
        "React Basics",
        "Learning React component lifecycle."
      ),
      new Post(
        2,
        "ReactJS HOL",
        "Understanding componentDidMount."
      ),
      new Post(
        3,
        "Blog Application",
        "Rendering posts using React."
      )
    ];

    this.setState({
      posts: posts
    });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.log(error);
    console.log(info);
  }

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h1>Blog Posts</h1>

        {this.state.posts.map((post) => (
          <div
            key={post.id}
            style={{
              border: "1px solid gray",
              margin: "10px",
              padding: "10px"
            }}
          >
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;