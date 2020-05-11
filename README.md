# Notes on repetitive Tooling setup

`gitconfig` file for custom commands I find extremely useful.
 * `git ls` one line list of git log, current branch
 * `git all` one line list of git log, all branches

#### Multiple ssh keys / multiple github accounts

`~/.ssh/config`
```
# user@custom github - eg for 'mydomain' replace 'custom' with 'mydomain'.
Host github.com-custom
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa_custom_user_github

# default account
Host github.com
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa
```

Now git clones for user@custom must be modify the dns identifier in `git@github.com` like so:
`git clone git@github.com-custom:custom/some-repo-you-have.git`

