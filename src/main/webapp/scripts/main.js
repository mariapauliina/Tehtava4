
function haeAsiakkaat(){
	let url = "Myynnit";
	let requestOptions = {
			method: "GET",
			headers:{"Content-Type": "application/x-www-form-urlencoded"}
	};
	fetch (myynnit, requestOptions)
	.then(response => response.json())
	.then(response => document.getElementById("ilmo").innerHTML=response)
	.catch(errorText => console.error("Fetch failed: " + errorText));
				
			} 
		function printItems(respObjList){
			let htmlStr="";
			for(let item of respObjList){
				htmlStr+="<tr asiakas_id"='rivi_"+item.asiakas_id"'>";
				htmlStr+="<td>"+item.etunimi+"</td>";
				htmlStr+="<td>"+item.sukunimi+"</td>";
				htmlStr+="<td>"+item.puhelin+"</td>";
				htmlStr+="<td>"+item.sposti+"</td>";
				//htmlStr+="<td><a href='muutaasiakas.jsp?id="+item.asiakas_id">Muuta</a>&nbsp;";
				//htmlStr+="<span class='poista' onclick=varmistaPoisto('"+item.id+"','"+endodeURI"')
				htmlStr+="</tr>";
				
			}document.getElementById("tbody").innerHTML=htmlStr;
		}