function FrontComp(props) {
  const liRows = [];

  for (let i = 0; i < props.propData1.length; i++) {
    liRows.push(
      <li key={i}>{props.propData1[i]}</li>
    );
  }
  return (
    <>
      <li>{props.frTitle}</li>
      <ul>
        {liRows}
      </ul>
    </>
  )

}

const BackComp = ({ propData2, baTitle }) => {

  const liRows = [];
  let keycnt = 0;
  for (let row of propData2) {
    liRows.push(
      <li key={keycnt++}>{row}</li>
    );
  }

  return (
    <>
      <li>{baTitle}</li>
      <ul>
        {liRows}
      </ul>
    </>
  );
}

function App() {
  const frontData = ['HTML', 'CSS3', 'JavaScript', 'jQuery'];
  const backData = ['Java', 'Oracle', 'JSP', 'Spring Boot'];
  return (
    <>
      <h2>React-Props</h2>
      <ol>
        <FrontComp propData1={frontData} frTitle="프론트엔드"></FrontComp>
        <BackComp propData2={backData} baTitle="백엔드" />

      </ol>
    </>
  )
}


export default App
