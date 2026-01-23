import FrontComp from './Component/FrontComp'
import BackComp from './Component/BackComp'

function App() {

    return (
        <>
            <h2>React 기본형</h2>

            <ol>
                <FrontComp onMyEvent1={() => {
                    alert('프론트엔드 클릭됨(부모전달)');
                }}></FrontComp>

                <BackComp onMyEvent2={(msg) => {
                    alert(msg);
                }}></BackComp>
            </ol>
        </>
    )
}

export default App
