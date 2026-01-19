function Mycomponent1(props) {
  return (
    <>
      <h2>prop객체 사용</h2>
      <p>
        {props.p1}, {props.p2}, {props.p3}, {props.p4}
      </p>
    </>
  );
}

function Mycomponent2({ p1, p2 }) {
  return (
    <>
      <h2>프롭스 구조 분해 할당</h2>
      <p>
        {p1}, {p2}
      </p>
    </>
  );
}

function App() {

  return (
    <>
      <Mycomponent2 p1={'HTML5'} p2={'CSS3'} p3={'JavaScript'} p4={'jQuery'} />
    </>
  )
}

export default App
