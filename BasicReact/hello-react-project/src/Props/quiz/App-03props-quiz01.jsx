function UserInfo({ name, age }) {
  return (
    <>
      {name}, {age}
    </>
  );
}

function App() {

  return (
    <>
      <UserInfo user name={'seongchan'} age={25} />
    </>
  )
}


export default App
