# README 

----
> @author : Saskia Giraud
> <br>@date : 2015/02/24
> <br>@string : Partiel
> <br>android:name = Note de Musique

### == Création projet == 
- new blank activity
- création des deux activités
	- MainActivity (login)
	- NoteActivity (converteur)
	- Login
	- WebActivity (webview)
- implémentation des SharedPreferences
- modification de l’android manifest

### == Conception == 

##### Navigation
**== Si c’est la première venu ==** <br>
remplir le form
- email = test@test.com
- password = test

En raison d’une non execution de la ligne 61 de MainActivity.java, il est necessaire de quitter l’application et de revenir dessus pour continuer la navigation. Nous en sommes désolé.

**== Si vous êtes déja venu ==**<br>
vous accedez directement au converter.


**== La view ==**<br>
Selection de note. Pour lancer la converstion, cliquer sur le boutton.


**== La web view ==**<br>
Cliquer sur le bouton de la page de convertion pour arriver sur une nouvelle activity web.
<br>
Un toast apparait pour vous indiquer l’url récupérée et loadé.
<br>
<br>
En raison d’un problème de permissions, l’url ne s’execute pas dans la webView. 

