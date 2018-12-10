def issue = [fields: [ project: [key: 'DEV'],
                       summary: 'New JIRA Created from Jenkins.',
                       description: 'New JIRA Created from Jenkins.',
                       issuetype: [name: 'Task']]]
def newIssue = jiraNewIssue issue: issue, site: 'ATMECS JIRA'
echo newIssue.data.key
