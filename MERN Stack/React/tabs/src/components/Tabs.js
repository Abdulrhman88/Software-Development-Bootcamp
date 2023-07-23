import React,{useState} from "react";

const Tabs=(props)=>{
    const{tab,setTab}=props;

    const Clickhandler =(e)=>{
        setTab({...tab,selectedTab:e,});
        
    }

return(
    <>
    {

       tab.content.map((tab, e)=>(
        <div onClick={() => Clickhandler(e)}>
            Tab{e+1}
        </div>
       ))
    }

<div>
    <p>{props.tab.content[props.tab.selectedTab]}</p>
</div>

    </>
)
}

export default Tabs;